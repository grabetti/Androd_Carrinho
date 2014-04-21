package com.example.carrinho;

import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;

public class Acelerometro implements SensorEventListener{

	private MovimentoController movimento;
	
	public Acelerometro(MovimentoController m)
	{
		movimento = m;
	}
	
	
	@Override
	public void onAccuracyChanged(Sensor sensor, int accuracy) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onSensorChanged(SensorEvent event) {
		// TODO Auto-generated method stub
		
	}

}
