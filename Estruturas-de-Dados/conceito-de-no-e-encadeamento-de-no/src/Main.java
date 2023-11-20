public class Main {
    public static void main(String[] args) {

        Node<String> one = new Node<>("Daniel ");        
        
        Node<String> two = new Node<>("é muito ");

        one.setNextNode(two);

        Node<String> tree = new Node<>("Bonito");

        two.setNextNode(tree);

        System.out.println(one);
        System.out.println( one.getNextNode() );
        System.out.println( two.getNextNode() );
    }
}
