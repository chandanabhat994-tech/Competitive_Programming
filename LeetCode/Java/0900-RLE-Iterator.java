class RLEIterator {
    int index = 0;
    int[] encoding;
    public RLEIterator(int[] encoding) {
        this.encoding = encoding;
    }
    
    public int next(int n) {
        while(index < encoding.length){
            if(encoding[index] >= n){
                encoding[index] = encoding[index] - n;
                return encoding[index + 1];
            }else{
                n = n - encoding[index];
                index += 2;
            }
        }
        return -1;
    }
}
