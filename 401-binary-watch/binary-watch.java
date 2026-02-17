class Solution {
    public List<String> readBinaryWatch(int turnedOn) {
        
        List<String> result = new ArrayList<>();

        for(int hour=0;hour<12;hour++){
            for(int minutes = 0; minutes<60;minutes++){
                   int HourBit = Integer.bitCount(hour);
                   int MinuteBit = Integer.bitCount(minutes);

                   if(HourBit+MinuteBit == turnedOn){

                    String time;

                    if(minutes<10){
                         time = hour + ":0" + minutes;
                    } else {
                        time = hour + ":" + minutes;
                    }
                    result.add(time);
                    }
                   }
        }
        return result;
    }
}
