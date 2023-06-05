
public class Demonstracao {

	public static void main(String[] args) {
		/*Classes wrapper - São classes que encapsulam ou "empacotam" um tipo 
		 * de dado primitivo ou uma estrutura de dados para fornecer funcionalidades 
		 * adicionais ou comportamento personalizado.
		*/
		//Autoboxing - exemplos

	   Boolean bolWrapped = true;
	   System.out.println(bolWrapped.getClass());
		
	   Character chWrapped = 'M'; 
       System.out.println(chWrapped.getClass());
       
       Byte byteWrapped = 1;
       System.out.println(byteWrapped.getClass());
       
       Short shoWrapped = 'L';
       System.out.println(shoWrapped.getClass());
       
       Integer intWrapped = 55; 
       System.out.println(intWrapped.getClass());
       
       Long longWrapped = 1234567896L;
       System.out.println(longWrapped.getClass());
       
       Float floatWrapped = 3.14159f;
       System.out.println(floatWrapped.getClass());
      
       Double doubWrapped = 3.14159;
       System.out.println(doubWrapped.getClass());		
}

}
