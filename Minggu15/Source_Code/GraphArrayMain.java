import java.util.Scanner;

public class GraphArrayMain {
    public static void main(String[] args) {
        int v, e, count = 1, to = 0, from = 0;
        Scanner sc = new Scanner(System.in);
        GraphArray<String> graph;
        try {
            System.out.print("Masukkan Jumlah Vertices: ");
            v = sc.nextInt();
            System.out.print("Masukkan Jumlah Edges: ");
            e = sc.nextInt();
            
            String[] vertex = new String[v + 1]; // Tipe data disesuaikan dengan data yang akan disimpan dalam Graph
            sc.nextLine();
            for (int i = 1; i <= v; i++) {
                System.out.print("Masukkan data vertex ke-" + i + " : ");
                vertex[i] = sc.nextLine();
            }
            graph = new GraphArray<String>(vertex);
            
            System.out.println("Masukkan Edge: <to> <from>");
            while (count <= e) {
                to = sc.nextInt();
                from = sc.nextInt();
                graph.makeEdge(to, from, 1);
                count++;
            }
            System.out.println("Array 2D sebagai representasi graph sbb: ");
            System.out.print(" \t");
            for (int i = 1; i <= v; i++) {
                System.out.print(vertex[i] + " ");
            }
            System.out.println();
            
            for (int i = 1; i <= v; i++) {
                System.out.print(vertex[i] + "\t");
                for (int j = 1; j <= v; j++) {
                    System.out.print(graph.getEdge(i, j) + "\t");
                }
                System.out.println();
            }
        } catch (Exception E) {
            System.out.println("Error, Silahkan cek kembali\n" + E.getMessage());
        }
        sc.close(); 
    }
}