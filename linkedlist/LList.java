class LList {
  Node head;
  Node tail;

  public LList(int value){
    Node newNode = new Node(value);
    this.head = newNode;
    this.tail = this.head;
  }

  public Node create(int value){
    return new Node(value);
  }

  public Node append(int value){
    Node newNode = new Node(value);
    this.tail.setNext(newNode);
    this.tail = newNode;
    return null;
  }

  public Node prepend(int value){
    Node newNode = new Node(value);
    newNode.setNext(head);
    head = newNode;
    return null;
  }

  public Node insert(int index, int value){
    Node newNode = new Node(value);
    Node targetNode = traverseToIndex(index-1);
    Node moveNode = targetNode.getNext();
    targetNode.setNext(newNode);
    newNode.setNext(moveNode);
    return null;
  }

  private Node traverseToIndex(int index){
    int counter =0;
    Node cnode = this.head;
    while(counter != index){
      cnode = cnode.getNext();
      counter++;
    }
    return cnode;
  }

  public Node remove(int index){
    Node targetNode = traverseToIndex(index-1);
    Node removeNode = targetNode.getNext();
    Node linkNode = removeNode.getNext();
    targetNode.setNext(linkNode);
    return null;
  }

  public void printLL(){
    System.out.println(this.head.getValue());
    Node cnode = this.head.getNext();
    while(cnode != null){
      System.out.println(cnode.getValue());
      cnode = cnode.getNext();
    }
    
  }

  
}
