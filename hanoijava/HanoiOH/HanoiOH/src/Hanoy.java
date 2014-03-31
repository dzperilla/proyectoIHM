import java.util.Stack;

class Hanoy {
    // Las 3 pilas de discos que utilizaremos.
    private Stack<Integer> columnas[];

    // Mandamos llamar el numero de discos que insertó el usuario.
    public Hanoy(int discos) {
        columnas = new Stack[3];
        // Inicializamos las columnas vacias que se utilizarán.
        columnas[0] = new Stack<Integer>();
        columnas[1] = new Stack<Integer>();
        columnas[2] = new Stack<Integer>();
        // Colocamos en la primera todos los discos ordenados de mayor a menor.
        for (int i=discos;i>0;i--) columnas[0].push(i);
    }

    // Muestra el estado actual en el que se encuentran los movimientos.
    public void Mostrar() {
        for (int i=0;i<3;i++) {
            System.out.print("Torre "+i+": ");
            for(int n : columnas[i]) System.out.print("["+n+"]");
            System.out.println("");
        }
    }

    // Mueve de la columna origen a la columna destino 1 disco
    public void Mover(int origen, int destino) {
        // Mostramos en pantalla lo que hacemos.
        Mostrar();
        System.out.println("Movimiento de un disco de la torre ("+origen+") a la torre ("+destino+")");
        System.out.println("");
        //Movimiento
        columnas[destino].push(columnas[origen].pop());
    }

    // Mueve de la columna origen a la columna destino varios discos.
    public void MoverN(int origen, int destino, int cuantas) {
        // Si solo es uno, se mueve sin más
        if (cuantas <= 1) Mover(origen,destino);
        else {
            // Si son varios, entonces:
            // - Primero movemos N-1 a la columna ni origen ni destino.
            MoverN(origen,3 - (origen+destino),cuantas-1);
            // - Movemos la N, es decir, la grande.
            Mover(origen,destino);
            // - Movemos las N-1 del primer paso, a la col. destino.
            MoverN(3 - (origen+destino),destino,cuantas-1);
        }
    }
}

