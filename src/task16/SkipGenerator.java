package task16;


import generators.CountingGenerator;
import generators.SGenerator;


public class SkipGenerator {
//    public static class
//    Boolean implements SGenerator<java.lang.Boolean> {
//        private boolean value = false;
//
//        public java.lang.Boolean next(int n) {
//            value = !value;
//            return value;
//        }
//
//        public java.lang.Boolean next() {
//            value = !value; // Just flips back and forth
//            return value;
//        }
//    }
//
//    public static class
//    Byte implements SGenerator<java.lang.Byte> {
//        private byte value = 0;
//
//        public Byte(int n) {
//            value = (byte) n;
//        }
//
//        public java.lang.Byte next(int n) {
//            return value += n;
//        }
//
//        public java.lang.Byte next() {
//            return value++;
//        }
//    }
//
//    static char[] chars = ("abcdefghijklmnopqrstuvwxyz" +
//            "ABCDEFGHIJKLMNOPQRSTUVWXYZ").toCharArray();
//
//    public static class
//    Character implements SGenerator<java.lang.Character> {
//        int index = -1;
//
//        public Character(int n) {
//            index = n;
//        }
//
//        public java.lang.Character next() {
//            index = (index + 1) % chars.length;
//            return chars[index];
//        }
//
//        public java.lang.Character next(int n) {
//            index = (index + n) % chars.length;
//            return chars[index];
//        }
//    }
//
//    public static class
//    String implements SGenerator<java.lang.String> {
//        private int length = 7;
//        SGenerator<java.lang.Character> cg = new Character(7);
//
//        public String() {
//        }
//
//
//        public String(int length) {
//            this.length = length;
//        }
//
//        public java.lang.String next(int n) {
//            char[] buf = new char[length];
//            for (int i = 0; i < length; i++)
//                buf[i] = cg.next(n);
//            return new java.lang.String(buf);
//        }
//
//        public java.lang.String next() {
//            char[] buf = new char[length];
//            for (int i = 0; i < length; i++)
//                buf[i] = cg.next();
//            return new java.lang.String(buf);
//        }
//    }
//
//    public static class
//    Short implements SGenerator<java.lang.Short> {
//        private short value = 0;
//
//        public Short(int n) {
//            value = (short) n;
//        }
//
//        public java.lang.Short next() {
//            return value++;
//        }
//
//        public java.lang.Short next(int n) {
//            return value = (short) +n;
//        }
//    }
//
//    public static class
//    Integer implements SGenerator<java.lang.Integer> {
//        private int value = 0;
//
//        public Integer(int n) {
//            value = n;
//        }
//
//        public java.lang.Integer next() {
//            return value++;
//        }
//
//        public java.lang.Integer next(int n) {
//            return value += n;
//        }
//    }
//
//    public static class
//    Long implements SGenerator<java.lang.Long> {
//        private long value = 0;
//
//        public Long(int n) {
//            value = n;
//        }
//
//        public java.lang.Long next() {
//            return value++;
//        }
//
//        public java.lang.Long next(int n) {
//            return value += n;
//        }
//    }
//
//    public static class
//    Float implements SGenerator<java.lang.Float> {
//        private float value = 0;
//
//        public Float(int n) {
//            value = (float) n;
//        }
//
//        public java.lang.Float next(int n) {
//            float result = value;
//            value += (float) n;
//            return result;
//        }
//
//        public java.lang.Float next() {
//            float result = value;
//            value += 1.0;
//            return result;
//        }
//    }

    public static class Double {
        private double value = 0.0;
        private double hm;

        public Double(int n) {
            hm = n;
        }

        private CountingGenerator.Double generator = new CountingGenerator.Double() {
            @Override
            public java.lang.Double next() {
                return value += hm;
            }
        };

        public CountingGenerator.Double getGenerator() {
            return generator;
        }
    }
}
