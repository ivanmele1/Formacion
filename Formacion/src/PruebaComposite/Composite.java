package PruebaComposite;

import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;


public class Composite {

    public static void main(final String[] args) {

        final Display display = new Display();

        final Shell shell = new Shell();
        shell.open();

        while (!shell.isDisposed()) {
            if (!display.readAndDispatch()) {
                display.sleep();
            }
        }
        display.dispose();

    }
}


       
       
//       //composite2
//       final Composite composite2 = BaseCustomFormToolkit.createComposite(compositePrincipal);
//       composite2.setBackground(ColorHelper.COLOR_CHOCOLATE);
//       composite2.setLayout(new GridLayout(1,true));
//       //final GridData gridData2 = new GridData(GridData.BEGINNING,GridData.CENTER,true,true);
//       composite2.setLayoutData(new GridData(SWT.FILL,SWT.FILL,true,true));
//       
//       
//       final Composite compositeUnidades = BaseCustomFormToolkit.createComposite(composite2);
//       compositeUnidades.setBackground(ColorHelper.COLOR_DARK_SLATE_GRAY);
//       compositeUnidades.setLayout(new GridLayout(2,true));
//       final CLabel labelUnidades = new CLabel(compositeUnidades, SWT.None);
//       labelUnidades.setText("Numero de unidades");
//       final CText cTextunidades = BaseCustomFormToolkit.createCText(compositeUnidades, SWT.BORDER);
//       
//       final Composite compositeCampana = BaseCustomFormToolkit.createComposite(composite2);
//       compositeCampana.setBackground(ColorHelper.COLOR_DARK_SLATE_GRAY);
//       compositeCampana.setLayout(new GridLayout(2,true));
//       final CLabel labelCampana = new CLabel(compositeCampana, SWT.None);
//       labelCampana.setText("Campaña");
//       final CText cTextCampana = BaseCustomFormToolkit.createCText(compositeCampana, SWT.BORDER);
//       
//       final Composite compositePedido = BaseCustomFormToolkit.createComposite(composite2);
//       compositePedido.setBackground(ColorHelper.COLOR_DARK_SLATE_GRAY);
//       compositePedido.setLayout(new GridLayout(2,true));
//       final CLabel labelPedido = new CLabel(compositePedido, SWT.None);
//       labelPedido.setText("Numero de Pedido");
//       final CText cTextPedido = BaseCustomFormToolkit.createCText(compositePedido, SWT.BORDER);
//      
//       final Composite compositeEntrada = BaseCustomFormToolkit.createComposite(composite2);
//       compositeEntrada.setBackground(ColorHelper.COLOR_DARK_SLATE_GRAY);
//       compositeEntrada.setLayout(new GridLayout(2,true));
//       final CLabel labelEntrada = new CLabel(compositeEntrada, SWT.None);
//       labelEntrada.setText("Numero de Entrada");
//       final CText cTextEntrada = BaseCustomFormToolkit.createCText(compositeEntrada, SWT.BORDER);
      
  

	