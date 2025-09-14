# Trabajo Práctico 5 📚
- Institución: Universidad de La Punta (ULP)
- Materia: Laboratorio de Programación I
- Año: 2025
- Integrantes (comisión 1, grupo 11):
  
  - Mauricio Reta
  - Juan Cruz Rodriguez
  - Agustín Mazza
  - Jeremías Hoyo
  - Facundo Lopez Cozzella
  - Jeremías Sirur Flores

## Consigna y Actividades
<p>Una clase <b>Directorio Telefónico</b> posee una lista de Contactos de los que interesa conocer su DNI, nombre, apellido, Ciudad y dirección. El Directorio, cuenta con un <b>TreeMap</b> de un teléfono tipo Long(Key), se empareja con un Contacto(valor). Además, posee las siguientes funcionalidades:</p>
<ol type="A">
  <li><b>agregarContacto()</b> que permite registrar un nuevo contacto con su respectivo nro. de teléfono. Siendo el nro. del teléfono la clave del mismo.</li>
  <li><b>buscarContacto()</b> que en base al nro. de teléfono retorna el Contacto asociado al mismo.</li>
  <li><b>buscarTelefono()</b> que en base a un apellido nos devuelve un Set<Long> con los números de teléfono asociados a dicho apellido.</li>
  <li><b>buscarContactos()</b> que en base a una ciudad nos devuelve un ArrayList con los Contactos asociados a dicha ciudad.</li>
  <li><b>borrarContacto()</b> que en base al número de teléfono elimina el contacto del directorio.</li>
</ol>
<ul>
  <li><u>Importante:</u> armar el modelo de clases UML representado las clases necesarias.</li>
  <li>Implementar en Java con <b>TreeMap<Long, Cliente>, TreeSet, e Iterator.</b> Recuerde el uso de: <b>keySet, entrySet</b> y en los if se sugiere <b>containsKey, containsValue.</b> </li>
  <li>Agregar 4-5 Contactos y probar en el Main todos los métodos (del A al E). </li>
  <li>El <i>JFrame</i> frmMenuPrincipal contiene un Directorio/Ciudades <i>(static)</i>.</li>
  <li>El frmAgregar, debe luego de initComponents, llenarComboCiudad<i>(addItem)</i>.</li>
  <li>Recuerda validarCampos vacíos, parseInt (teléfono y DNI) y también limpiar campos.</li>
  <li>
    Se deben poder agregar nuevas Ciudades al listado (List o Set) existente.
    <HR>
    <img width="1039" height="832" alt="imgParaElREADME7" src="https://github.com/user-attachments/assets/be357055-f229-4d0c-ab7f-495bfe0afea6" />
  </li>
  <li>
    El frmBuscar debe luego de initComponents llenarListaTelefonos. Use el evento valueChanged para que al seleccionar un teléfono del JList (getSelectedValue) se carguen los JTextField de la derecha. ↓↓↓
    <HR>
    <img width="872" height="671" alt="imgParaElREADME8" src="https://github.com/user-attachments/assets/976c2ab2-8c12-4615-ac6b-7e57c0575a70" />
  </li>
  <li>
    El frmBorrar debe luego de initComponents llenarListaDNI. Use el evento valueChanged para que al seleccionar un teléfono del JList (getSelectedValue) se carguen la JTable de la derecha (DefaultTableModel y     model.addRow). ↓↓↓
    <HR>
    <img width="910" height="602" alt="imgParaElREADME9" src="https://github.com/user-attachments/assets/08615a80-0a2c-4724-9ca6-a173fc660290" />
  </li>
  <li>
    El frmBuscarClienteCiudad debe luego de initComponents llenarComboCiudad(addItem). Puede usar el evento itemStateChanged para que al seleccionar una ciudad del JCombo (getSelectedValue) se carguen la           JTable de la derecha (DefaultTableModel y model.addRow). ↓↓↓
    <HR>
    <img width="933" height="421" alt="imgParaElREADME10" src="https://github.com/user-attachments/assets/577dc501-912f-477a-8547-944ba0b5cd83" />
  </li>
