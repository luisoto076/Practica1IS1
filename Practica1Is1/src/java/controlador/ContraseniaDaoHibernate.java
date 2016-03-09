package controlador;

import Mapeo.Contrasenia;
import java.util.List;

/**
 *
 * @author 
 */
public class ContraseniaDaoHibernate extends AbstractDao {

    public ContraseniaDaoHibernate() {
        super();
    }

    /**
     * Insert a new Contrasenia into the database.
     *
     * @param contrasenia
     */
    public void save(Contrasenia contrasenia) throws DataAccessLayerException {
        super.save(contrasenia);
    }

    /**
     * Updates a new Contrasenia into the database.
     *
     * @param contrasenia
     */
    public void update(Contrasenia contrasenia) throws DataAccessLayerException {
        super.update(contrasenia);
    }

    /**
     * Delete a detached Contrasenia from the database.
     *
     * @param contrasenia
     */
    public void delete(Contrasenia contrasenia) throws DataAccessLayerException {
        super.delete(contrasenia);
    }

    /**
     * Find an Event by its primary key.
     *
     * @param id
     * @return
     */
    public Contrasenia find(Long id) throws DataAccessLayerException {
        return (Contrasenia) super.find(Contrasenia.class, id);
    }

    /**
     * Lista todos los contrasenias de la base de datos
     *
     * @return
     */
    public List findAll() throws DataAccessLayerException {
        return super.findAll(Contrasenia.class);
    }
}
