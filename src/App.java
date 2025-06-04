

import controllers.QueueG;
import controllers.Stack;
import controllers.StackG;
import models.Persona;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        System.out.println("---------------------------------------");
        System.out.println("PILA NORMAL");
        Stack stack= new Stack();
        stack.push(10);
        stack.push(-1);
        stack.push(5);
        stack.push(8);
        
        // System.out.println(stack.pop());
        // System.out.println(stack.peek());
        // System.out.println(stack.peek());
        // System.out.println(stack.peek());
        stack.printStack();
        System.out.println("Tam = " + stack.size());
        stack.pop();
        stack.printStack();
        System.out.println("Tam = " + stack.size());


        System.out.println("-------------------------------------------");
        System.out.println("PILA GENERICA");
        StackG<Integer> pilaG = new StackG<Integer>();
        pilaG.push(10);
        pilaG.push(8);
        pilaG.push(-1);
        pilaG.push(5);
        System.out.println("Tam = " + pilaG.size());
        pilaG.printStack();
        pilaG.pop();
        System.out.println("Tam = " + pilaG.size());   
        pilaG.printStack();


        System.out.println("----------------------------------------------");
        System.out.println("COLAS GENERICAS");
       Persona p1 = new Persona("Juan");
       Persona p2 = new Persona("Maria");
       Persona p3 = new Persona("Pedro");
       Persona p4 = new Persona("David");      

       QueueG<Persona> colaPersonas = new QueueG<Persona>();
       colaPersonas.add(p1);
       colaPersonas.add(p2);
       colaPersonas.add(p3);
       colaPersonas.add(p4);
       colaPersonas.printCola();
       System.out.println("Persona atendida ->" + colaPersonas.remove());
       colaPersonas.printCola();
       Persona pB = colaPersonas.findByName("Juan");
       System.out.println(" Persona encontrada -> " + (pB != null ? pB : "ninguna"));
       Persona pE = colaPersonas.deleteByName("Pedro");
       System.out.println(" Persona eliminada -> " + (pE != null ? pE : "ninguna"));
       colaPersonas.printCola();

    }
}
