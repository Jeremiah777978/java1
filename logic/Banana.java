import java.util.*;

class Banana {
    static class Edge {
        int to, cost;
        Edge(int t, int c){ to=t; cost=c; }
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine().trim());

        List<Set<Integer>> trees = new ArrayList<>();
        List<List<int[]>> treeEdges = new ArrayList<>();
        Set<Integer> curTree = new HashSet<>();
        List<int[]> curEdges = new ArrayList<>();

        for(int i=0;i<n;){
            String line = sc.nextLine().trim();
            if(line.isEmpty()) continue;
            i++;
            if(line.equals("break")){
                trees.add(new HashSet<>(curTree));
                treeEdges.add(new ArrayList<>(curEdges));
                curTree.clear(); curEdges.clear();
                continue;
            }
            String[] parts = line.split(" ");
            int lower = Integer.parseInt(parts[0]);
            curTree.add(lower);
            for(int j=1;j<parts.length;j++){
                int upper = Integer.parseInt(parts[j]);
                curTree.add(upper);
                curEdges.add(new int[]{upper, lower, 0}); // down
                curEdges.add(new int[]{lower, upper, 1}); // up
            }
        }

        if(!curTree.isEmpty() || treeEdges.isEmpty()){
            trees.add(new HashSet<>(curTree));
            treeEdges.add(new ArrayList<>(curEdges));
        }

        String[] last = sc.nextLine().trim().split(" ");
        int startSpot = Integer.parseInt(last[0]);
        int endSpot = Integer.parseInt(last[1]);

        Map<Integer, List<Integer>> spotToTrees = new HashMap<>();
        for(int t=0;t<trees.size();t++)
            for(int s:trees.get(t))
                spotToTrees.computeIfAbsent(s,k->new ArrayList<>()).add(t);

        Map<String,Integer> spotIndex = new HashMap<>();
        int idx=0;
        for(int t=0;t<trees.size();t++)
            for(int s:trees.get(t))
                if(!spotIndex.containsKey(s+"#"+t)) spotIndex.put(s+"#"+t,idx++);

        @SuppressWarnings("unchecked")
        List<Edge>[] adj = new ArrayList[idx];
        for(int i=0;i<idx;i++) adj[i]=new ArrayList<>();

        for(int t=0;t<treeEdges.size();t++)
            for(int[] e:treeEdges.get(t))
                adj[spotIndex.get(e[0]+"#"+t)].add(new Edge(spotIndex.get(e[1]+"#"+t),e[2]));

        for(Map.Entry<Integer,List<Integer>> en:spotToTrees.entrySet()){
            List<Integer> lst = en.getValue();
            if(lst.size()<=1) continue;
            int spot = en.getKey();
            for(int i=0;i<lst.size();i++)
                for(int j=0;j<lst.size();j++)
                    if(i!=j) adj[spotIndex.get(spot+"#"+lst.get(i))].add(new Edge(spotIndex.get(spot+"#"+lst.get(j)),1));
        }

        int startIdx = spotIndex.get(startSpot+"#"+spotToTrees.get(startSpot).get(0));
        boolean[] isDest = new boolean[idx];
        for(int t:spotToTrees.get(endSpot))
            isDest[spotIndex.get(endSpot+"#"+t)] = true;

        int INF = Integer.MAX_VALUE/4;
        int[] dist = new int[idx];
        Arrays.fill(dist,INF);
        dist[startIdx]=0;
        PriorityQueue<int[]> pq = new PriorityQueue<>(Comparator.comparingInt(a->a[0]));
        pq.add(new int[]{0,startIdx});
        int minEnergy = INF;

        while(!pq.isEmpty()){
            int[] cur = pq.poll();
            int cost = cur[0], u = cur[1];
            if(cost>dist[u]) continue;
            if(isDest[u]) minEnergy = Math.min(minEnergy,cost);
            for(Edge e:adj[u]){
                int newCost = cost + e.cost;
                if(newCost < dist[e.to]){
                    dist[e.to] = newCost;
                    pq.add(new int[]{newCost,e.to});
                }
            }
        }

        System.out.print(minEnergy==INF?-1:minEnergy);
    }
}
