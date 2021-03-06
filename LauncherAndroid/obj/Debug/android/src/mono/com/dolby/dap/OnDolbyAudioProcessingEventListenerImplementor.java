package mono.com.dolby.dap;


public class OnDolbyAudioProcessingEventListenerImplementor
	extends java.lang.Object
	implements
		mono.android.IGCUserPeer,
		com.dolby.dap.OnDolbyAudioProcessingEventListener
{
	static final String __md_methods;
	static {
		__md_methods = 
			"n_onDolbyAudioProcessingClientConnected:()V:GetOnDolbyAudioProcessingClientConnectedHandler:Com.Dolby.Dap.IOnDolbyAudioProcessingEventListenerInvoker, DolbyAPI\n" +
			"n_onDolbyAudioProcessingClientDisconnected:()V:GetOnDolbyAudioProcessingClientDisconnectedHandler:Com.Dolby.Dap.IOnDolbyAudioProcessingEventListenerInvoker, DolbyAPI\n" +
			"n_onDolbyAudioProcessingEnabled:(Z)V:GetOnDolbyAudioProcessingEnabled_ZHandler:Com.Dolby.Dap.IOnDolbyAudioProcessingEventListenerInvoker, DolbyAPI\n" +
			"n_onDolbyAudioProcessingProfileSelected:(Lcom/dolby/dap/DolbyAudioProcessing$PROFILE;)V:GetOnDolbyAudioProcessingProfileSelected_Lcom_dolby_dap_DolbyAudioProcessing_PROFILE_Handler:Com.Dolby.Dap.IOnDolbyAudioProcessingEventListenerInvoker, DolbyAPI\n" +
			"";
		mono.android.Runtime.register ("Com.Dolby.Dap.IOnDolbyAudioProcessingEventListenerImplementor, DolbyAPI, Version=1.0.0.0, Culture=neutral, PublicKeyToken=null", OnDolbyAudioProcessingEventListenerImplementor.class, __md_methods);
	}


	public OnDolbyAudioProcessingEventListenerImplementor () throws java.lang.Throwable
	{
		super ();
		if (getClass () == OnDolbyAudioProcessingEventListenerImplementor.class)
			mono.android.TypeManager.Activate ("Com.Dolby.Dap.IOnDolbyAudioProcessingEventListenerImplementor, DolbyAPI, Version=1.0.0.0, Culture=neutral, PublicKeyToken=null", "", this, new java.lang.Object[] {  });
	}


	public void onDolbyAudioProcessingClientConnected ()
	{
		n_onDolbyAudioProcessingClientConnected ();
	}

	private native void n_onDolbyAudioProcessingClientConnected ();


	public void onDolbyAudioProcessingClientDisconnected ()
	{
		n_onDolbyAudioProcessingClientDisconnected ();
	}

	private native void n_onDolbyAudioProcessingClientDisconnected ();


	public void onDolbyAudioProcessingEnabled (boolean p0)
	{
		n_onDolbyAudioProcessingEnabled (p0);
	}

	private native void n_onDolbyAudioProcessingEnabled (boolean p0);


	public void onDolbyAudioProcessingProfileSelected (com.dolby.dap.DolbyAudioProcessing.PROFILE p0)
	{
		n_onDolbyAudioProcessingProfileSelected (p0);
	}

	private native void n_onDolbyAudioProcessingProfileSelected (com.dolby.dap.DolbyAudioProcessing.PROFILE p0);

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
