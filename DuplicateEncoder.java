        public static String encode2(String word){
            word = word.toLowerCase();
            String result = "";
            for (int i = 0; i < word.length(); ++i) {
                char c = word.charAt(i);
                result += word.lastIndexOf(c) == word.indexOf(c) ? "(" : ")";
            }
            return result;
        }
        public static String encode(String word){
            int leng = word.length();
            String result = "";
            String[] list,list2 = new String[leng];
            list = word.toLowerCase().split("");
            for(int j = 0; j<leng; j++){
                for(int i = j+1; i<leng; i++){
                    if(list[j].equalsIgnoreCase(list[i])){
                        list2[j]=")";
                        list2[i]=")";
                    }
                }
            }
            for(int k = 0; k<list2.length;k++){
                if(list2[k]!=")"){
                    list2[k]="(";
                    result += list2[k];
                }else{
                    result +=list2[k];
                }
            }
            return result;
        }
