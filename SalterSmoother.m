fs = 1000;
f = 50;
x = 0:1/fs:10/f-1/fs;
y = sin(2*pi*f*x);
xn = y + 0.2*randn(size(y));

xf = zeros(size(xn));
N = 5;

for idx = N:length(xn)
  xf(idx) = sum(xn(idx-N+1:idx))/N; %SMOOTHING FUNCTION
end

figure
subplot(3,1,1)
plot(x,y)
xlabel('X-Axis')
ylabel('Y-Axis')
title('Original')
subplot(3,1,2)
plot(x,xn)
grid minor
xlabel('X-Axis')
ylabel('Y-Axis')
title('Salted')
subplot(3,1,3)
plot(x,xf)
grid minor
xlabel('X-Axis')
ylabel('Y-Axis')
title('Smoothed')

%reference https://www.youtube.com/watch?v=l-P0QlJKGRU