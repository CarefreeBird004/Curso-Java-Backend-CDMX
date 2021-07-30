//In the following program, explain why the value "6" is printed twice in a row:
class PrePostDemo {
    public static void main(String[] args){
        int i = 3;
        i++;
        System.out.println(i);    // "4"
        ++i;
        System.out.println(i);    // "5"
        System.out.println(++i);  // "6"  Aqui antes de imprimir se hace el incremento a 6 ya que es un prefijo
        System.out.println(i++);  // "6"  Aquí primero se imprime 6 y después se incrementa ya que es un sufijo
        System.out.println(i);    // "7"
    }
}
