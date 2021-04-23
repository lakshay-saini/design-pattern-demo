package com.example.pattern.builder;

public class Employee {

    private final int var1;
    private final int var2;
    private final int var3;
    private final int var4;

    private Employee(EmployeeBuilder builder) {
        this.var1 = builder.var1;
        this.var2 = builder.var2;
        this.var3 = builder.var3;
        this.var4 = builder.var4;
    }

    public int getVar1() {
        return var1;
    }

    public int getVar2() {
        return var2;
    }

    public int getVar3() {
        return var3;
    }

    public int getVar4() {
        return var4;
    }

    public static class EmployeeBuilder {
        private int var1;
        private int var2;
        private int var3;
        private int var4;

        public EmployeeBuilder(int var1) {
            this.var1 = var1;
        }

        public EmployeeBuilder setVar1(int var1) {
            this.var1 = var1;
            return this;
        }

        public EmployeeBuilder setVar2(int var2) {
            this.var2 = var2;
            return this;
        }

        public EmployeeBuilder setVar3(int var3) {
            this.var3 = var3;
            return this;
        }

        public EmployeeBuilder setVar4(int var4) {
            this.var4 = var4;
            return this;
        }

        public Employee build() {
            return new Employee(this);
        }
    }
}
