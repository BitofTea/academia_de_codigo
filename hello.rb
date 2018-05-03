def welcome(name)
  puts 'Hello'+ name +', welcome to Terceira'
end

cadet = 'cadet'

if ARGV[0]
  cadet = ARGV[0]
end

welcome(cadet)
