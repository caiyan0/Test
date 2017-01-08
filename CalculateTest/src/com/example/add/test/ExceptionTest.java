package com.example.add.test;

import com.example.add.MainActivity;
import com.robotium.solo.Solo;

import android.test.ActivityInstrumentationTestCase2;
import android.util.Log;
import android.widget.TextView;

public class ExceptionTest extends ActivityInstrumentationTestCase2<MainActivity>{
	Solo solo;

	public ExceptionTest() {
		super(MainActivity.class);
	}

	@Override
	protected void setUp() throws Exception {
		// TODO Auto-generated method stub
		super.setUp();
		solo = new Solo(getInstrumentation(), getActivity());
	}

	public void testTest() {
		solo.enterText(0, "3");
		solo.enterText(1, "4");
		solo.clickOnButton(0);
		// solo.takeScreenshot("error");
		Log.i("AUTO", "=========================test1");
		TextView view = (TextView) solo.getView("com.example.add:id/resultff");
		Log.i("AUTO", "=========================test2");
		String actualResult = view.getText().toString();
		assertEquals(7, Integer.parseInt(actualResult));
	}

	@Override
	protected void tearDown() throws Exception {
		super.tearDown();
	}

	@Override
	protected void runTest() throws Throwable {
		// TODO Auto-generated method stub
		try{
			super.runTest();
		}catch(Throwable th){
			solo.takeScreenshot(this.getClass().getSimpleName());
			throw th;
		}
		
	}
	
	

}
