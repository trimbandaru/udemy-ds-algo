class Queue{
  private Node first;
  private Node last;
  private int length;

  public Queue(){
    this.first = null;
    this.last = null;
    length = 0;
  }

  public void enqueue(int value){
    Node newNode = new Node(value);
    if(this.first == null){
      this.first = newNode;
      this.last = newNode;
    }else{
      this.last.setNext(newNode);
      this.last = newNode;
    }
    length++;
  }

  public Node dequeue(){
    Node node;
    if(this.first == this.last){
      node = this.first;
      this.first = null;
      this.last = null;
      return node;
    }else{
      node = this.first;
      this.first = this.first.getNext();
    }
    return node;
  }

  public Node peek(){
    return this.first;
  }

  public void print(){
    Node cnode = this.first;
    while(cnode != null){
      System.out.println(cnode.getValue());
      cnode = cnode.getNext();
    }
    System.out.println("---------------");
  }
}
