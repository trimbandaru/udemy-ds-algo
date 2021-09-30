class Main {
  public static void main(String[] args) {
    // System.out.println("Hello world!");
   
    LList list = new LList(1);
    list.printLL();
    System.out.println("----------");
    list.append(2);
    list.printLL();
    System.out.println("----------");
    list.prepend(3);
    list.printLL();
    System.out.println("----------");

    list.insert(1, 4);
    list.printLL();
    System.out.println("----------");

    list.remove(1);
    list.printLL();
    System.out.println("----------");

    
  }
}
