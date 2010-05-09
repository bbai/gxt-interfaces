package gxt.visual.interfaces;

import com.extjs.gxt.ui.client.widget.grid.ColumnHeader;

import gxt.visual.interfaces.presenter.IColumnHeaderPresenter;
import gxt.visual.interfaces.view.IColumnHeaderView;

/**
 * @author eugenp
 */
public interface IColumnHeader extends IBoxComponent, IColumnHeaderView, IColumnHeaderPresenter{

	/** mine */
	ColumnHeader getComponent();

}
