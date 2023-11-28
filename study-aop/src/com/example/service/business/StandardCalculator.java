package com.example.service.business;

import com.example.service.Calculator;

public class StandardCalculator implements Calculator {
	private Calculator proxy = this;
	
	public void setProxy(Calculator proxy) { // object learns its proxy!
		this.proxy = proxy;
	}

	@Override
	public double add(double x, double y) {
		return x+y;
	}

	@Override
	public double sub(double x, double y) {
		return x-y;
	}

	@Override
	public double div(double x, double y) {
		return x/y;
	}

	@Override
	public double mul(double x, double y) {
		var sum = 0.0;
		for (var i=0;i<x;++i)
			sum = proxy.add(sum,y);
		return sum;
	}

}
