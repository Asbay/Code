package patika;

public class Solution2 {

        public static void main(String []args){
            Sports c1 = new Sports() {
                @Override
                String getName() {
                    return null;
                }
            };
            Soccer c2 = new Soccer();
            System.out.println(c1.getName());
            c1.getNumberOfTeamMembers();
            System.out.println(c2.getName());
            c2.getNumberOfTeamMembers();


    }
}
