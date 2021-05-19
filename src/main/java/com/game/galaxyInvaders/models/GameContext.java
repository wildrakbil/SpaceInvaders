package com.game.galaxyInvaders.models;

import com.game.galaxyInvaders.controller.iterator.impl.AgregateConcrete;
import com.game.galaxyInvaders.controller.threads.*;

import java.io.Serializable;

/**
 * Created by AnDrEy on 4/29/2021.
 */
public class GameContext implements Serializable {


    private static final long serialVersionUID = 1L;

    private static GameContext _game;

    private PlayerShotThread _playerShotThreads;
    private AnimationEnemyThread _animationEnemyThread;
    private MoveEnemyThread _moveEnemyThread;
    private EnemiesCreateShotThread _enemiesCreateShotThread;
    private EnemiesShotThread _enemiesShotThread;

    private String _name;
    private Level _level;
    private int _score;
    private Player _player;
    private AgregateConcrete _enemies;
    private boolean _start;

    private GameContext() {
        this._start = true;
    }

    public static GameContext getInstance() {
        createIntance();
        return _game;
    }

    private synchronized static void createIntance() {
        if (_game == null) {
            _game = new GameContext();
        }
    }

    public String getName() {
        return _name;
    }

    public void setName(String name) {
        this._name = name;
    }

    public Level getLevel() {
        return _level;
    }

    public void setLevel(Level level) {
        this._level = level;
    }

    public int getScore() {
        return _score;
    }

    public void setScore(int score) {
        this._score = score;
    }

    public Player getPlayer() {
        return _player;
    }

    public void setPlayer(Player player) {
        this._player = player;
    }

    public boolean isStart() {
        return _start;
    }

    public void setStart(boolean start) {
        this._start = start;
    }

    public PlayerShotThread getPlayerShotThreads() {
        return _playerShotThreads;
    }

    public void setPlayerShotThreads(PlayerShotThread playerShotThreads) {
        this._playerShotThreads = playerShotThreads;
    }

    public AnimationEnemyThread getAnimationEnemyThread() {
        return _animationEnemyThread;
    }

    public void setAnimationEnemyThread(AnimationEnemyThread animationEnemyThread) {
        this._animationEnemyThread = animationEnemyThread;
    }

    public MoveEnemyThread getMoveEnemyThread() {
        return _moveEnemyThread;
    }

    public void setMoveEnemyThread(MoveEnemyThread moveEnemyThread) {
        this._moveEnemyThread = moveEnemyThread;
    }

    public AgregateConcrete getEnemies() {
        return _enemies;
    }

    public void setEnemies(AgregateConcrete enemies) {
        this._enemies = enemies;
    }

    public EnemiesCreateShotThread getEnemiesCreateShotThread() {
        return _enemiesCreateShotThread;
    }

    public void setEnemiesCreateShotThread(EnemiesCreateShotThread enemiesShotThread) {
        this._enemiesCreateShotThread = enemiesShotThread;
    }

    public EnemiesShotThread getEnemiesShotThread() {
        return _enemiesShotThread;
    }

    public void setEnemiesShotThread(EnemiesShotThread enemiesShotThread) {
        this._enemiesShotThread = enemiesShotThread;
    }
}
