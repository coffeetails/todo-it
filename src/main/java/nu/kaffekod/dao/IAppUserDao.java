package nu.kaffekod.dao;

import nu.kaffekod.AppUser;

public interface IAppUserDAO {
    public AppUser persist(AppUser appUser);
    public AppUser findByUsername(String username);
    public AppUser findAll();
    public void remove(String username);
}

