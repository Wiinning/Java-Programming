package twoDarray;

public class Practice3 {
    public static void main(String[] args) {
        String[][] names = {
                {},
                {"Sun", "Winning", "Ching Chou"},
                {"Visal", "Khemarak", "Rotha"},
                {"Cheang Pheak"},
                {"Vireak"}
        };
        for (int i = 0; i < names.length; i++) {
            System.out.print("Row: " + (i + 1) + " ");
            for (int j = 0; j < names[i].length; j++) {
                System.out.print(names[i][j] + " | ");
            }
            System.out.println();
        }
    }
}




