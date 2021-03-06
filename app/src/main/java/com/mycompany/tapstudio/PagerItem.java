/**************************************************************
 | Author: Dimitar Dyankov  								   | 
 | Class that holds imformation about a fragment editor        |
 **************************************************************/
package com.mycompany.tapstudio;
import android.support.v4.app.*;

public class PagerItem {
	private String mTitle;
	private Fragment mFragment;


	public PagerItem(String mTitle, Fragment mFragment) {
		this.mTitle = mTitle;
		this.mFragment = mFragment;
	}
	public String getTitle() {
		return mTitle;
	}
	public Fragment getFragment() {
		return mFragment;
	}
	public void setTitle(String mTitle) {
		this.mTitle = mTitle;
	}

	public void setFragment(Fragment mFragment) {
		this.mFragment = mFragment;
	}

}
