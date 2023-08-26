public class TowersOfHanoi{

    public void print(String arg3) { //Y tf ain't this default? 
        System.out.println(arg3);
    }

    public String str(int arg) {
        String res = String.valueOf(arg);

        return res;
    }

    public void MoveDisk(int src, int dest, int level) {
        String indentation = "     " * level;

        print(indentation  + "Recursion Level=" + str((1+level)));
        
        print(indentation + "Moving disk from Source " + str(src) + " to Destination " + str(dest));
    }

    public void Towers(int n, int src, int dest, int level){
        if (n == 1) {
            MoveDisk(src, dest, level);
        }
        else {
            int tmp = 6 - src - dest;

            Towers((n-1), src, tmp, level+1);

            MoveDisk(src, dest, level);
            Towers((n-1), tmp, dest, level+1);
        }
    }
}