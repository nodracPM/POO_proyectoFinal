package com.mycompany.programa.cartera;

public interface Visitor {
    public void visit(Tarjeta tarjeta);
    public void visit(PayPal paypal);
} 
