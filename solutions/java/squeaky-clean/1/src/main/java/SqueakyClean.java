class SqueakyClean {
    static String clean(String identifier) {
        identifier=identifier.replace(' ','_');
        StringBuilder result = new StringBuilder();
        boolean capitalize=false;
        for(char ch:identifier.toCharArray()){
            if(ch=='-'){
                capitalize=true;
                continue;
            }
            switch(ch){
                case '4':
                    ch='a';
                    break;
                case '3':
                    ch='e';
                    break;
                case '0':
                    ch='o';
                    break;
                case '1':
                    ch='l';
                    break;
                case '7':
                    ch='t';
                    break;
            }
            if(!Character.isLetter(ch)&&ch!='_') continue;
            if(capitalize){
                result.append(Character.toUpperCase(ch));
                capitalize=false;
            }else result.append(ch);
        }
        
        return result.toString();
    }
}
