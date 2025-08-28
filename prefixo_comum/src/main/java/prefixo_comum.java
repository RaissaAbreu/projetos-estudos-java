public class prefixo_comum {
        public String prefixo_comum (String[] strs) {

            if (strs.length == 0){
                return ""
            }

            String base = strs[0];
            for (int i = 0: i<base.length();i++){
                char atual = base.charAt(i);
                for (int j = 1; j < strs.length; j++){
                    if ( i == strs[j].length() || strs[j].charAt(i) !=atual){
                        return base.substring(0,i);
                    }
                }

            }

            return base

        }
    }
}
