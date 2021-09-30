class Node{
  private int value;
  private Node next;
  private int length;

  public Node(int value){
    this.value = value;
    this.next = null;
    this.length++;
  }

  public int getValue(){
    return this.value;
  }

  public void setNext(Node node){
    this.next = node;
  }

  public Node getNext(){
    return this.next;
  }
}
