class Solution {
    public double angleClock(int hour, int minutes) {
        double Q=0.5*Math.abs(60*hour-11*minutes);
        return Math.min(Q,360-Q);
    }
}