package launcherandroid;


public class AndroidActivity
	extends waveengine.adapter.Application
	implements
		mono.android.IGCUserPeer
{
	static final String __md_methods;
	static {
		__md_methods = 
			"n_onKeyDown:(ILandroid/view/KeyEvent;)Z:GetOnKeyDown_ILandroid_view_KeyEvent_Handler\n" +
			"n_onPause:()V:GetOnPauseHandler\n" +
			"n_onResume:()V:GetOnResumeHandler\n" +
			"";
		mono.android.Runtime.register ("LauncherAndroid.AndroidActivity, LauncherAndroid, Version=1.0.0.0, Culture=neutral, PublicKeyToken=null", AndroidActivity.class, __md_methods);
	}


	public AndroidActivity () throws java.lang.Throwable
	{
		super ();
		if (getClass () == AndroidActivity.class)
			mono.android.TypeManager.Activate ("LauncherAndroid.AndroidActivity, LauncherAndroid, Version=1.0.0.0, Culture=neutral, PublicKeyToken=null", "", this, new java.lang.Object[] {  });
	}


	public boolean onKeyDown (int p0, android.view.KeyEvent p1)
	{
		return n_onKeyDown (p0, p1);
	}

	private native boolean n_onKeyDown (int p0, android.view.KeyEvent p1);


	public void onPause ()
	{
		n_onPause ();
	}

	private native void n_onPause ();


	public void onResume ()
	{
		n_onResume ();
	}

	private native void n_onResume ();

	java.util.ArrayList refList;
	public void monodroidAddReference (java.lang.Object obj)
	{
		if (refList == null)
			refList = new java.util.ArrayList ();
		refList.add (obj);
	}

	public void monodroidClearReferences ()
	{
		if (refList != null)
			refList.clear ();
	}
}
