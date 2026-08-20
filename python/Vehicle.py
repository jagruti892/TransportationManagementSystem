# Abstract Parent Class

from abc import ABC, abstractmethod


class Vehicle(ABC):
# allows us to create an Abstract Base Class.
    def __init__(self, vehicleId, vehicleNumber, capacity):
        self.vehicleId = vehicleId
        self.vehicleNumber = vehicleNumber
        self.capacity = capacity

    @abstractmethod
    def displayVehicleDetails(self):
        pass
