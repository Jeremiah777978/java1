// // 
// // here is linkedlist example refer here
// class Linkedlist
// {
//         private Node head;
//         private Node tail;
//         int size =0;
//     class Node
//     {
//         int data;
//         Node next;
//        Node(int data)
//        {
//            this.data = data;
//            this.next = null;
//        }
//     }
//     public void create(int data)
//     {
//      Node newnode = new Node(data);
//      if(head == null)
//      {
//          head = newnode;
//          size++;
//          return;
//      }
//      Node temp;
//      temp = head;
//      while(temp.next!= null)
//      {
//          temp = temp.next;
//      }
//        temp.next = newnode; 
//        size++;
//     }
//     public void print()
//     {
//         Node temp = head;
//         while(temp != null)
//         {
//             System.out.println(temp.data);
//             temp = temp.next;
//         }
//     }
//     public  void  insert(int data)
//     {
//         create(data);
//     }
//     public void insertmiddle(int data,int index)
//     {
//         if(size==0)
//         {
//             create(data);
//         }
//         if(size==index)
//         {
//             insert(data);
//         }
//         Node temp = head;
//         for( int i =0;i<index;i++)
//         {
//             temp =temp.next;
//         }
//         Node node = new Node(data);
//        node.next = temp.next;
//         temp.next = node;
//         size++;
//     }
//     public void removehead()
//     {
//         head = head.next;
//         size--;
//     }
//     public void removelast()
//     {
//         Node temp=head;
//         while(temp.next.next != null)
//         {
//             temp = temp.next;
//         }
//         temp.next= null;
//     }
//     public  static void main(String[] agrs)
//     {
//        Linkedlist l1 = new Linkedlist();
//        l1.create(10);
//        l1.create(20);
//        l1.create(30);
//        l1.insert(60);
//        l1.insert(80);
//        l1.insertmiddle(70,3);
//        l1.removehead();
//        l1.removelast();
//       l1. print();
//       System.out.println(l1.size);
//     }
// }
