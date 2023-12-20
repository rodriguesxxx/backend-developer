class Node<T> {
    private T content;
    private Node<T> nextNode = null;

    public Node(T content){
        this.content = content;
    }

    public T getContent(){
        return this.content;
    }

    public void setContent(T content){
        this.content = content;
    }

    public Node<T> getNextNode(){
        return this.nextNode;
    }

    public void setNextNode(Node<T> node){
        this.nextNode = node;
    }

    @Override
    public String toString(){
        return "{" + "content: " + getContent() + "}";
    }
}