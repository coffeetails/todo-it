package nu.kaffekod.dao;

import nu.kaffekod.AppUser;

import java.util.List;

public interface IAppUserDao {
    public AppUser persist(AppUser appUser);
    public AppUser findByUsername(String username);
    public List<AppUser> findAll();
    public void remove(String username);
}
