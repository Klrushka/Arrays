package task16;


import generators.CountingGenerator;
import generators.Generator;
import generators.SGenerator;


public class SkipGenerator {
        public static class Boolean {
        private boolean value;
        private int hm;
        private int i = 0;

        public Boolean(int n){
            hm = n;
        }

        private CountingGenerator.Boolean generator = new CountingGenerator.Boolean(){
            @Override
            public java.lang.Boolean next() {
                value = i % 2 != 0;
                i += hm;
                return value;
            }
        };

            public CountingGenerator.Boolean getGenerator() {
                return generator;
            }
        }

    public static class Byte {
        private byte value = 0;
        private byte hm;

        public Byte(int n) {
            hm = (byte) n;
        }

        private CountingGenerator.Byte generator = new CountingGenerator.Byte(){
            @Override
            public java.lang.Byte next() {
                return value += hm;
            }
        };

        public CountingGenerator.Byte getGenerator() {
            return generator;
        }
    }

    static char[] chars = ("abcdefghijklmnopqrstuvwxyz" +
            "ABCDEFGHIJKLMNOPQRSTUVWXYZ").toCharArray();

    public static class Character {
        private int index = -1;

        public Character(int n) {
            index = n;
        }

        private CountingGenerator.Character generator = new CountingGenerator.Character() {
            @Override
            public java.lang.Character next() {
                index = (index * 2) % chars.length;
                return chars[index];
            }
        };

        public CountingGenerator.Character getGenerator() {
            return generator;
        }
    }

    public static class String {
        private int length;
        private int skip;
        private Generator<java.lang.String> cg = new CountingGenerator.String() {
            @Override
            public java.lang.String next() {
                CountingGenerator.Character charGen = new SkipGenerator.Character(skip).getGenerator();
                char[] buf = new char[length];
                for (int i = 0; i < length; i++)
                    buf[i] = charGen.next();
                return new java.lang.String(buf);
            }
        };

        public String(int length, int skip) {
            this.length = length;
            this.skip = skip;
        }

        public Generator<java.lang.String> getGenerator() {
            return cg;
        }
    }

    public static class Short {
        private short value = 0;
        private short hm;

        public Short(int n) {
            hm = (short) n;
        }

        private CountingGenerator.Short generator = new CountingGenerator.Short() {
            @Override
            public java.lang.Short next() {
                return (short) (value += hm);
            }
        };

        public CountingGenerator.Short getGenerator() {
            return generator;
        }
    }

    public static class Integer {
        private int value = 0;
        private int hm;

        public Integer(int n) {
            hm = n;
        }

        private CountingGenerator.Integer generator = new CountingGenerator.Integer() {
            @Override
            public java.lang.Integer next() {
                return value += hm;
            }
        };

        public CountingGenerator.Integer getGenerator() {
            return generator;
        }
    }

    //
    public static class Long {
        private long value = 0;
        private long hm;

        public Long(int n) {
            hm = n;
        }


        private CountingGenerator.Long generator = new CountingGenerator.Long() {
            @Override
            public java.lang.Long next() {
                return value += hm;
            }
        };

        public CountingGenerator.Long getGenerator() {
            return generator;
        }
    }

    public static class Float {
        private float value = 0f;
        private float hm;
        private CountingGenerator.Float generator = new CountingGenerator.Float() {
            @Override
            public java.lang.Float next() {
                return value += hm;
            }
        };

        public Float(float n) {
            hm = n;
        }

        public CountingGenerator.Float getGenerator() {
            return generator;
        }
    }

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
