package gxt.visual.interfaces;

import com.extjs.gxt.ui.client.widget.SplitBar;

import gxt.visual.interfaces.presenter.ISplitBarPresenter;
import gxt.visual.interfaces.view.ISplitBarView;

/**
 * @author eugenp
 */
public interface ISplitBar extends IBoxComponent, ISplitBarView, ISplitBarPresenter{
	
	/** mine */
	SplitBar getComponent();

}
