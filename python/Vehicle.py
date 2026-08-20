# Abstract Parent Class

from abc import ABC, abstractmethod


class Vehicle(ABC):

    def __init__(self, vehicleId, vehicleNumber, capacity):
        self.vehicleId = vehicleId
        self.vehicleNumber = vehicleNumber
        self.capacity = capacity

    @abstractmethod
    def displayVehicleDetails(self):
        pass