public class MethodeBinaire {
    /*cette methode prend un nombre et retourne la reference d'un tableau contenant
    le nombre prit en parametre convertit en binaire*/
    static int[] transformToBin(int n){
        //On convertis le nombre et on le met dans la variable binary
        String binary = Integer.toString(n,2);

        //on cree un tableau ayant la taille du nombre binaire
        int[] tab = new int[binary.length()];
        int j= binary.length()-1, tmp=Integer.parseInt(binary);

        while(j >= 0) {
            tab[j] = tmp % 10;
            tmp = tmp / 10;
            j--;
        }

        return tab;
    }

    public static void main(String[] args){

        //n c'est la valeur de la puissance et x c'est le nombre mis en exposent x^n
        int n = 10, x = 2;

        //on utilise la fonction transformToBin et on la recupere dans la reference du tableau t
        int[] t=transformToBin(n);

        //on ecrase la valeur de t[0] comme dans la methode mathematique
        t[0] = x;

        for (int i = 1; i < t.length; i++){
            if (t[i] == 0)
                //si t[i] est egale a zero on met t[0] au carre {t[0]^2}
                t[0] = t[0]*t[0];
            else
                //si t[i] est egale a un on met t[0] au carre puis on le multiplie par x {(t[0]^2)*x}
                t[0] = (t[0]*t[0])*x;
        }
        System.out.println(x + " a la puissance " + n + " vaut:\t"+ t[0]);
    }

}
