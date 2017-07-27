package com.example.meituan2;

import com.example.alipay2.Alipay;

import android.app.Activity;
import android.content.ComponentName;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Bundle;
import android.os.IBinder;
import android.os.RemoteException;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

public class MainActivity extends Activity {

	private MyServiceConnection myServiceConnection;
	private Alipay alipay;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		Intent intent = new Intent("com.itheima.alipay");
		myServiceConnection = new MyServiceConnection();
		//绑定Service
		bindService(intent, myServiceConnection,BIND_AUTO_CREATE);
	}
	
	public void pay(View view) throws RemoteException{
		alipay.pay(100);
	}
	
	
	class MyServiceConnection implements ServiceConnection{

		@Override
		public void onServiceConnected(ComponentName name, IBinder service) {
			
			alipay = Alipay.Stub.asInterface(service); 
		}

		@Override
		public void onServiceDisconnected(ComponentName name) {
			
		}
		
	}
	
	@Override
	protected void onDestroy() {
		super.onDestroy();
		unbindService(myServiceConnection);
	}

	
}
