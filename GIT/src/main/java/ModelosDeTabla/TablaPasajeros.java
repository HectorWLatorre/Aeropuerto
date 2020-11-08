/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Axel Alza
 */
package ModelosDeTabla;



import Logica.Pasajeros.Pasajero;
import Logica.Pasajeros.Pasajeros;
import java.util.ArrayList;
import javax.swing.table.AbstractTableModel;



// Esto es medio igual al DefaultTableModel, pero con un giro , el modelo no muestra por cada pasajero un array con su info,
// Si no que desde ya saca la info de un arrayList de objetos.
// Al trabajar puramente con objetos nos evitamos recorrer con fors y facilita la transaccion de info entre clases
// AbstractTableModel contiene todos los metodos de DefaultTableModel mas los que nosotros le implementemos

public final class TablaPasajeros extends AbstractTableModel {

    ArrayList<Pasajero> ArrayPas;

    public TablaPasajeros() {
        ArrayPas = Pasajeros.getInstancia().getListado();
        //Cuando se crea un nuevo Modelo , traer los datos de la fachada de pasajeros
    }

    
    //Todos estos son metodos, que usa el jtable
    @Override
  
    public int getColumnCount() {
        return 4;
    }

      // Devuelve el numero de columnas de cada objeto de pasajeros en este caso son 4 por que pasajeros tiene 4 campos

    @Override
    public int getRowCount() {
        return ArrayPas.size();
    }
        // Devuelve el numero de objetos en el arraylist, informacion que el Jtable necesita


    @Override
    public String getColumnName(int IndiceColumna) {
        String NombreColumna = null;
        switch (IndiceColumna) {
            case 0:
                NombreColumna = "Pasaporte";
                break;
            case 1:
                NombreColumna = "Nombre";
                break;
            case 2:
                NombreColumna = "Edad";
                break;
            case 3:
                NombreColumna = "Sexo";
                break; 
        }
        return NombreColumna;
    }
    // Devuelve el nombre de cada columna, para que el Jtable lo muestre

  
    @Override
    public Object getValueAt(int row, int col) {
        Object ret = null;
        switch (col) {
            case 0:
                ret = ArrayPas.get(row).getPasaporte();
                break;
            case 1:
                ret = ArrayPas.get(row).getNombre();
                break;
            case 2:
                ret = ArrayPas.get(row).getEdad();
                break;
            case 3:
                ret = ArrayPas.get(row).getSexo();
                break;
   
        }
        return ret;
    }
    
    // Devuelve el valor de cierta columna en cierta fila

    @Override
    public Class getColumnClass(int c) {
        return getValueAt(0, c).getClass();
    }
        // Devuelve el tipo de dato de la columna


    
    public void addPasajero(Pasajero pasajero) {
        ArrayPas.add(pasajero);
        fireTableDataChanged();
        
    }

    public void setPasajero(int i, Pasajero pasajero) {
        ArrayPas.set(i, pasajero);
        fireTableDataChanged();
    }

    public void delPasajero(int i) {
        ArrayPas.remove(i);
        fireTableDataChanged();

    }
    
        //Problemas modernos requieren soluciones modernas
    //Estos metodos son para agregar Articulos al modelo que jtable usa y luego que se refresque

    public Pasajero getPasajero(int row) {
        Pasajero pasajero = this.ArrayPas.get(row);
        return pasajero;
    }
    
    // Devuelve el pasajero, lo vamos a necesitar si queremos modificar o eliminar pasajeros

}

