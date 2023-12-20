## Tipos Complexos de Variaveis

Para cada tipo primitivo de variavel se tem um objeto(classe) para ele. Exemplos: 

<html>
    <table border="1">
        <thead>
            <th>boolean</th>
            <th>byte</th>
            <th>char</th>
            <th>short</th>
            <th>int</th>
            <th>long</th>
            <th>float</th>
            <th>double</th>
        </thead>
        <tbody>
            <td>Boolean</td>
            <td>Byte</td>
            <td>Character</td>
            <td>Short</td>
            <td>Integer</td>
            <td>Long</td>
            <td>Float</td>           <td>Double</td>
        </tbody>
    </table>
</html>

### Porque usar classes Wrrapers? 

Agilidade no desenvolvimento, poís existe enumeros metodos uteis em classes wrrapers, além de ser uma boa pratica.

## Exemplo de uso

```java
    /*
     * @author Daniel Rodrigues
    */
    class Wrraper {

    private Integer age = 18; 
    private Character sex;
    private Double sale;

    void testInteger(){
        System.out.println(this.age.compareTo(18) == 0 ? "Pode acessar" : "Nao pode acessar");
    }
    void testCharacter(){
        System.out.println(this.sex.toLowerCase('M'));
    }
    void testDouble(){
        System.out.println(this.sale.isNaN(3.2));
    }

    public static void main(String[] args){
        Wrraper wp = new Wrraper();
        wp.testInteger();
        wp.testCharacter();
        wp.testDouble();
    }    
}

```