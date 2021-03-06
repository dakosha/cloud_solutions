package kz.clouds.drugstore.ui.main;

import com.vaadin.annotations.AutoGenerated;
import com.vaadin.data.util.BeanContainer;
import com.vaadin.ui.AbsoluteLayout;
import com.vaadin.ui.CustomComponent;
import com.vaadin.ui.Label;
import com.vaadin.ui.ListSelect;

public class NomenclatureEditor extends CustomComponent {

	public static final String VIEW_ID = "NomenclatureEditor";
	
	@AutoGenerated
	private AbsoluteLayout mainLayout;
	@AutoGenerated
	private Label label_1;
	@AutoGenerated
	private ListSelect listSelect_1;
	/**
	 * The constructor should first build the main layout, set the
	 * composition root and then do any custom initialization.
	 *
	 * The constructor will not be automatically regenerated by the
	 * visual editor.
	 */
	public NomenclatureEditor() {
		buildMainLayout();
		setCompositionRoot(mainLayout);

	}

	@AutoGenerated
	private AbsoluteLayout buildMainLayout() {
		// common part: create layout
		mainLayout = new AbsoluteLayout();
		mainLayout.setImmediate(false);
		mainLayout.setWidth("100%");
		mainLayout.setHeight("100%");
		
		// top-level component properties
		setWidth("100.0%");
		setHeight("100.0%");
		
		// listSelect_1
		listSelect_1 = new ListSelect();
		listSelect_1.setImmediate(false);
		listSelect_1.setWidth("200px");
		listSelect_1.setHeight("250px");
		mainLayout.addComponent(listSelect_1, "top:20.0px;left:0.0px;");
		
		// label_1
		label_1 = new Label();
		label_1.setCaption("Номенклатура");
		label_1.setImmediate(false);
		label_1.setWidth("200px");
		label_1.setHeight("-1px");
		label_1.setValue("Номенклатура");
		mainLayout.addComponent(label_1, "top:2.0px;left:0.0px;");
		
		return mainLayout;
	}

}
