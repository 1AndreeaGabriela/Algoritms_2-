public class Main {
    public static void main(String[] args) {

      System.out.println("---------EXERCITIUL 1-----------");
      System.out.println();

      String exp = "512+4*+3-";
      System.out.print("Expresia postfixata " + exp + " are rezultatul:  ");
      System.out.println(PostFix.evaluatePostfix(exp));
      System.out.println();




      System.out.println("--------------EXERCITIUL 2--------------");
      System.out.println("--------------The maze------------------");

      int [][]maze={
              {0,0,1,1,1},
              {1,0,0,0,0},
              {1,0,1,1,1},
              {1,0,0,0,1},
              {1,1,1,0,0}
      };

      int sX=0;
      int sY=0;
      int fX=4;
      int fY=4;

      TheMaze obj=new TheMaze(maze,sX,sY,fX,fY);
      obj.solve();





      System.out.println("---------------EXERCITIUL 3.1-------------");
      System.out.println("--------Lista simpla inlantuita-----------");
      ListaSimpla ll = new ListaSimpla();

      ll.insert(6);
      ll.insert(5);
      ll.insert(4);
      ll.insert(3);
      ll.insert(2);
      ll.insert(1);

      ll.show();
      ll.deleteN_Node(2);
      ll.show();
      System.out.println("Inserare la mijlocul listei");
      ll.insertMiddle(55);
      ll.show();
      ll.deleteStart();
      ll.show();
      ll.deleteLast();
      ll.show();

      System.out.println("---------------EXERCITIUL 3.2-------------");
      System.out.println("--------Lista dublu inlantuita------------");

      ListaDubla ld = new ListaDubla();
      ld.insert(6);
      ld.insert(5);
      ld.insert(4);
      ld.insert(3);
      ld.insert(2);
      ld.insert(1);
      ld.show();

      ld.deleteN_Node(2);
      ld.show();
      System.out.println("Inserare la mijlocul listei");
      ld.insertMiddle(88);
      ld.show();
      ld.deleteStart();
      ld.show();
      ld.deleteLast();
      ld.show();

      System.out.println("---------------EXERCITIUL 4---------------");
      System.out.println("---------------Lista circulara------------");

      ListaCirculara lc = new ListaCirculara();
      lc.insert(1);
      lc.insert(2);
      lc.insert(3);
      lc.insert(4);
      lc.insert(5);
      lc.insert(6);
      lc.show();

      lc.deleteN_Node(2);
      lc.show();
      lc.insertMiddle(66);
      lc.show();
      lc.deleteStart();
      lc.show();
      lc.deleteLast();
      lc.show();










    }
}
