y = 0:20;
y = y .^2;    % X-Y Plot
figure(1)
subplot(3,1,1)
plot(y)
title('XY PLOT')
grid minor


x = 0:20;
subplot(3,1,2)
scatter(x,y)
title('SCATTER') % Scatter Plot
grid minor


a = randn(1000,1);
subplot(3,1,3)
hist(a,50)
title('HISTOGRAM') %Histogram Plot
grid minor


x = [1 2 3 2 1]
y = x;
z = x' * y;
figure(2)
subplot(2,1,1)
contour(z)
title('CONTOUR'). %Contour Plot
grid minor


x = 0:0.1:2*pi;
y = linspace(0.1,0.1,63);
subplot(2,1,2)
polar(x,y)
title('POLAR PLOT') %Polar Plot
grid minor


x = -10:10;
y = x;
[x,y] = meshgrid(x,y);
z = x .^2 + y .^2;
figure(3)
subplot(2,1,1)
mesh(x,y,z);
title('3D-MESHES') %3D Mesh Plot
grid minor

a = 1:6;
e = [1 0 1 0 1 0];
subplot(2,1,2)
pie(a,e);
title('PIE CHARTS') %Pie Chart Plot
grid minor
