import numpy as np
import matplotlib.pyplot as plt

t1 = np.arange(0.0, 5.0, 0.1)
t2 = np.arange(0.0, 5.0, 0.02)

plt.figure(1)
plt.subplot(211)
plt.plot(t1, np.exp(-t1) * np.cos(2*np.pi*t1), 'bo', t1, np.exp(-t1) * np.cos(2*np.pi*t1), 'k')

plt.subplot(212)
plt.plot(t2, np.cos(2*np.pi*t2), 'r--')
plt.show()
