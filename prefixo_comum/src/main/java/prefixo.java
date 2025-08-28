public class prefixo {
        public String prefixo(String[] strs) {
            if (strs.length == 0){
                return "";
            }

            String base = strs[0];
            for (int i = 0; i<base.length();i++){
                char atual = base.charAt(i);
                for (int j = 1; j < strs.length; j++){
                    if ( i == strs[j].length() || strs[j].charAt(i) !=atual){
                        return base.substring(0,i);
                    }
                }

            }

            return base;

        }
    }

}
public class Main {
    public static prefixo void main(String[] args) {
        Solution sol = new Solution();
        String[] input = { "flower", "flow", "flight" };
        System.out.println(sol.prefixo(input)); // Saída: "fl"
    }
}
