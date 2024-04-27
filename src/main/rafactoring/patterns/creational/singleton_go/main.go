package main

import "sync"

var lock sync.Mutex
var once sync.Once

type DriverPg struct {
	conn string
}

var instance *DriverPg

// With mutex
//Aggresive check every time not perfect method
func conncetSingletonMutex() *DriverPg {

	if instance != nil {
		lock.Lock()
		defer lock.Unlock()

		instance = &DriverPg{"connect"}
	}

	return instance
}

// With sync.Once
// Once is an object that will perform exactly one action.
// A Once must not be copied after first use.
func connectSingletonOnce() *DriverPg {
	once.Do(func() {
		instance = &DriverPg{"connect"}

	})
	return instance
}
