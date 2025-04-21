package nu.kaffekod.dao.impl;

import nu.kaffekod.AppUser;
import nu.kaffekod.dao.IAppUserDao;

import java.util.ArrayList;
import java.util.List;

public class AppUserDaoImpl implements IAppUserDao {
    private List<AppUser> appUserDAOCollection = new ArrayList<>();

    @Override
    public AppUser persist(AppUser appUser) {
        appUserDAOCollection.add(appUser);
        return appUser;
    }
    
    @Override
    public AppUser findByUsername(String username) {
        for(AppUser appUser : appUserDAOCollection) {
            if(appUser.getUsername().equals(username)) {
                return appUser;
            }
        }
        return null;
    }
    
    @Override
    public List<AppUser> findAll() {
        return appUserDAOCollection;
    }
    
    @Override
    public void remove(String username) {
        for(AppUser appUser : appUserDAOCollection) {
            if(appUser.getUsername().equals(username)) {
                appUserDAOCollection.remove(appUser);
            }
        }
    }
    
}
